package org.mltk.task.t_mcmf;

import java.util.List;

/**
 * 
 * @author superhy
 *
 */
public class T_MCMFTrSentimentAnalysis {

	public void trSentimentAnalysis(NetworkFlowGraph networkFlowGraph) {

		// ͳ�Ƶ����ͱ���
		int n = networkFlowGraph.getsDocPoints().size()
				+ networkFlowGraph.getsTopicPoints().size()
				+ networkFlowGraph.gettDocPoints().size()
				+ networkFlowGraph.gettTopicPoints().size();
		int m = networkFlowGraph.getCrossDomainDiffSpace().getKlArcs().size()
				+ networkFlowGraph.getCrossDomainInfSpace().getMiArcs().size()
				+ networkFlowGraph.getTopicHierarchicalSpace().getDtArcs()
						.size()
				+ networkFlowGraph.getTopicHierarchicalSpace().getTdArcs()
						.size();

		CrossDomainDiffSpace crossDomainDiffSpace = networkFlowGraph
				.getCrossDomainDiffSpace();
		CrossDomainInfSpace crossDomainInfSpace = networkFlowGraph
				.getCrossDomainInfSpace();
		TopicHierarchicalSpace topicHierarchicalSpace = networkFlowGraph
				.getTopicHierarchicalSpace();
		List<Integer> sDocPoints = networkFlowGraph.getsDocPoints();
		List<Integer> sTopicPoints = networkFlowGraph.getsTopicPoints();
		List<Integer> tDocPoints = networkFlowGraph.gettDocPoints();
		List<Integer> tTopicPoints = networkFlowGraph.gettTopicPoints();

		MinCostMaxFlow minCostMaxFlow = new MinCostMaxFlow(n, m);
		int s = 0, t = n + 1;
		for (int i = 0; i < crossDomainDiffSpace.getKlArcs().size(); i++) {

			int u = crossDomainDiffSpace.getKlArcs().get(i).sWord.topicLdaId, v = crossDomainDiffSpace
					.getKlArcs().get(i).tWord.topicLdaId; // ��ʼ����յ�
			double volume = crossDomainInfSpace.getMiArcs().get(i).arcWeight; // ����
			double cost = crossDomainDiffSpace.getKlArcs().get(i).arcCost; // ����

			minCostMaxFlow.addEdge(u, v, volume, cost);
		}
		for (int i = 0; i < topicHierarchicalSpace.getDtArcs().size(); i++) {

			int u = topicHierarchicalSpace.getDtArcs().get(i).ldaDoc.docLdaId, v = topicHierarchicalSpace
					.getDtArcs().get(i).ldaTopic.topicLdaId; // ��ʼ����յ�
			double volume = topicHierarchicalSpace.getDtArcs().get(i).arcWeight; // ����
			double cost = 0; // ����

			minCostMaxFlow.addEdge(u, v, volume, cost);
		}
		for (int i = 0; i < topicHierarchicalSpace.getTdArcs().size(); i++) {

			int u = topicHierarchicalSpace.getTdArcs().get(i).ldaTopic.topicLdaId, v = topicHierarchicalSpace
					.getTdArcs().get(i).ldaDoc.docLdaId; // ��ʼ����յ�
			double volume = topicHierarchicalSpace.getTdArcs().get(i).arcWeight; // ����
			double cost = 0; // ����

			minCostMaxFlow.addEdge(u, v, volume, cost);
		}
		for (Integer sDocPoint : sDocPoints) {

			minCostMaxFlow.addEdge(s, sDocPoint, 1, 0);
		}
		for (Integer tDocPoint : tDocPoints) {

			minCostMaxFlow.addEdge(tDocPoint, t, 1, 0);
		}

		// ִ����С���������
		minCostMaxFlow.exec();

		// TODO ��������������VSM��д���ļ�

	}

}
