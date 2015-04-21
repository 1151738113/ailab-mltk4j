package org.mltk.libsvm;

import java.util.HashMap;
import java.util.Map;

import libsvm.svm;
import libsvm.svm_model;
import libsvm.svm_parameter;
import libsvm.svm_problem;

import org.mltk.libsvm.model.ClassifyRes;
import org.mltk.libsvm.model.TestDataItem;

public class LibSVMClassifierForecast {

	// �������ݼ�
	private svm_problem classifyTrainSet;
	// �������ò���
	private svm_parameter classifyParame;

	private LibSVMParameFactory parameFactory;

	public LibSVMClassifierForecast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibSVMClassifierForecast(LibSVMParameFactory parameFactory) {
		super();
		this.parameFactory = parameFactory;
	}

	// LibSVM�����������ܷ���
	public Map<Integer, ClassifyRes> classifyDriver(svm_model model) {

		ClassifyRes classifyRes = new ClassifyRes();

		// TODO

		return null;
	}

	// LibSVM������ִ�нӿ�
	public Map<Integer, ClassifyRes> exec(String svmModelDiskPath,
			TestDataItem testDataItem) {

		Map<Integer, ClassifyRes> classifyResMap = new HashMap<Integer, ClassifyRes>();

		try {

			svm_model model = svm.svm_load_model(svmModelDiskPath);

			// TODO
			classifyResMap = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return null;
		}

		return classifyResMap;
	}

	public svm_problem getClassifyTrainSet() {
		return classifyTrainSet;
	}

	public void setClassifyTrainSet(svm_problem classifyTrainData) {
		this.classifyTrainSet = classifyTrainData;
	}

	public svm_parameter getClassifyParame() {
		return classifyParame;
	}

	public void setClassifyParame(svm_parameter classifyParame) {
		this.classifyParame = classifyParame;
	}

	public LibSVMParameFactory getParameFactory() {
		return parameFactory;
	}

	public void setParameFactory(LibSVMParameFactory parameFactory) {
		this.parameFactory = parameFactory;
	}
}
