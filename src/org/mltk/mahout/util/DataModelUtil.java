package org.mltk.mahout.util;

import org.apache.mahout.cf.taste.model.DataModel;
import org.mltk.mahout.load.impl.LoadFileTasteDataImpl;

public class DataModelUtil {

	/**
	 * �Ӵ����ļ�����������ģ��
	 * 
	 * @param flagFileModel
	 * @param filePath
	 * @return
	 */
	public static DataModel loadDataModelFromFile(String filePath) {

		// �Ӵ����ļ�����������
		DataModel fileModel = new LoadFileTasteDataImpl(filePath)
				.loadDataFromOutRes();

		return fileModel;
	}
}
