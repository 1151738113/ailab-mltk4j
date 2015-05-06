package org.mltk.hankcs.lda.model;

import java.util.List;
import java.util.Map;

import org.mltk.lucene.model.Word;

public class LdaWord extends Word {

	// ����topic ���ɸ���
	private List<Map<LdaTopic, Double>> belongTopics;

	public LdaWord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LdaWord(String wordText, List<Map<LdaTopic, Double>> belongTopics) {
		super(wordText);
		this.belongTopics = belongTopics;
	}

	public List<Map<LdaTopic, Double>> getBelongTopics() {
		return belongTopics;
	}

	public void setBelongTopics(List<Map<LdaTopic, Double>> belongTopics) {
		this.belongTopics = belongTopics;
	}

	@Override
	public String toString() {
		return "LdaWord [belongTopics=" + belongTopics + "]";
	}

}
