package org.mltk.libsvm;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import libsvm.svm_node;
import libsvm.svm_problem;

public class LibSVMClassifier {

	// TODO ��װ����
	public Map<Integer, Integer> classifyDriver(
			Map<Double, List<String[]>> trainData, Integer trainSetSize,
			Integer trainSetScale, List<String[]> testData) {

		/*
		 * ����ѵ�������ݣ���ѵ����������ΪLibSVM�ܹ�ʶ��ĸ�ʽ
		 */
		svm_problem trainSet = new svm_problem();
		svm_node[][] trainSpace = new svm_node[trainSetSize][trainSetScale];
		double[] trainLabels = new double[trainSetSize];

		int trainEntryNum = 0;
		for (Entry<Double, List<String[]>> trainEntry : trainData.entrySet()) { // ������ʱ������ʹ��entry����map����
			// ��������������ѵ�����
			trainLabels[trainEntryNum] = trainEntry.getKey();

			// ������������������ֵ
			int vectorEleNum = 0;
			for (String[] vectorNode : trainEntry.getValue()) {
				svm_node trainNode = new svm_node();
				trainNode.index = Integer.parseInt(vectorNode[1]);
				trainNode.value = Double.parseDouble(vectorNode[2]);

				trainSpace[trainEntryNum][vectorEleNum] = trainNode;
				vectorEleNum++;
			}
			trainEntryNum++;
		}

		// ��������飬�����ռ��ѵ����������������setģ��
		trainSet.x = trainSpace;
		trainSet.y = trainLabels;
		trainSet.l = trainSetSize;
		
		

		return null;
	}
}
