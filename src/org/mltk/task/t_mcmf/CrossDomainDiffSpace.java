package org.mltk.task.t_mcmf;

import java.util.List;

import org.mltk.hankcs.lda.model.LdaWord;

public class CrossDomainDiffSpace {

	/**
	 * sWord-tWord cost arc
	 * 
	 * @author superhy
	 *
	 */
	class klArc {
		LdaWord sWord;
		LdaWord tWord;
		double arcCost;

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
	public void transKltoWords(List<LdaWord> sWords, List<LdaWord> tWords) {

		System.out.println("����ת���������ֵ������");
		
		for (LdaWord sWord : sWords) {
			for (LdaWord tWord : tWords) {
				
				double S_kl = 0.0;
				
			}
		}
	}

}
