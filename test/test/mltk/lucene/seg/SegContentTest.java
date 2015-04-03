package test.mltk.lucene.seg;

import org.ansj.lucene3.AnsjAnalysis;
import org.apache.lucene.analysis.Analyzer;
import org.junit.Test;

public class SegContentTest {

	@Test
	public void testSplitWord() {
		Analyzer a1 = new AnsjAnalysis();

		String txt = "�����к�����ɣ�Ҵ�Ժǰ��ǧ����ޱ����֦��Ҷï�������ã�ȴ��2013���10��10������(����������)����������������������29��Ԫ�ı��ꡣ�ڶ��죬��ޱ������͵�˵��ɶ������ƳǸ��ٵ�һ�����ڴ���������ĳ��58��Ԫ�ļ۸���۸���ĳ��׬��29��Ԫ����ĳ��û������ޱ�����Լ�����ͣ����������Ͱ�����������ʥ�����һ��԰�չ�˾��������88��Ԫ�ļ۸�";
		AnalyzerUtils.displayToken(txt, a1);
	}
}
