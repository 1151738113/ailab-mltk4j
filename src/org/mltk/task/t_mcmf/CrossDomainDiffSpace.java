package org.mltk.task.t_mcmf;

import java.util.List;

import org.mltk.task.t_mcmf.model.LdaGraph;
import org.mltk.task.t_mcmf.model.LdaTopic;

public class CrossDomainDiffSpace {

	/**
	 * sWord-tWord cost arc
	 * 
	 * @author superhy
	 *
	 */
	class klArc {
		LdaTopic sWord;
		LdaTopic tWord;
		double arcCost;

		public klArc(LdaTopic sWord, LdaTopic tWord, double arcCost) {
			super();
			this.sWord = sWord;
			this.tWord = tWord;
			this.arcCost = arcCost;
		}

		@Override
		public String toString() {
			return "klArc [sWord=" + sWord + ", tWord=" + tWord + ", arcCost="
					+ arcCost + "]";
		}
	}

	private List<klArc> klArcs;

	public CrossDomainDiffSpace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CrossDomainDiffSpace(List<klArc> klArcs) {
		super();
		this.klArcs = klArcs;
	}

	public List<klArc> getKlArcs() {
		return klArcs;
	}

	public void setKlArcs(List<klArc> klArcs) {
		this.klArcs = klArcs;
	}

	@Override
	public String toString() {
		return "CrossDomainDiffSpace [klArcs=" + klArcs + "]";
	}

	/**
	 * �������ڵ���ת��klɢ�ȵ�������ڵ���
	 * 
	 * @param sTopic
	 * @param tTopic
	 * @param kl
	 */
	public void transKltoWords(LdaGraph sLdaGraph, LdaGraph tLdaGraph) {

		System.out.println("����ת���������ֵ������");

		// klɢ�ȼ��㹤����
		KLDivergence klDivergence = new KLDivergence();

		for (LdaTopic sTopic : sLdaGraph.allTopics) {
			for (LdaTopic tTopic : tLdaGraph.allTopics) {
				double arcCost = klDivergence.compTopicsGenKL(
						sTopic.generateWords, tTopic.generateWords);
				this.klArcs.add(new klArc(sTopic, tTopic, arcCost));
			}
		}
	}
}
