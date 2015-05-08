package org.mltk.task.t_mcmf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author dd
 *
 */
public class KLDivergence {

	/**
	 * ��Map
	 * 
	 * @author dd
	 * @param distribute1
	 * @param distribute2
	 * @return
	 */
	public static double compTopicsGenKL(Map<Integer, Double> distribute1,
			Map<Integer, Double> distribute2) {

		/*String keyStringA = "";
		String keyStringB = "";
		List<Integer> themeProKeyA = new ArrayList<Integer>();
		List<Integer> themeProKeyB = new ArrayList<Integer>();
		// �û��洢���е�key
		List<Integer> themeProKey = new ArrayList<Integer>();

		double KLDis = 0;

		for (Entry<Integer, Double> themeMapA : distribute1.entrySet()) {
			int themeKeyA = themeMapA.getKey();
			themeProKeyA.add(themeKeyA);
			// �Ȱ��������A�е�key����themeProKey
			themeProKey.add(themeKeyA);
			keyStringA += String.valueOf(themeKeyA) + ",";
			// double themeProANumber = themeMapA.getValue();

		}

		for (Entry<Integer, Double> themeMapB : distribute2.entrySet()) {
			int themeKeyB = themeMapB.getKey();
			themeProKeyB.add(themeKeyB);
			keyStringB += String.valueOf(themeKeyB) + ",";
		}

		// �б�key�Ƿ����themeProB��
		for (Integer keyA : themeProKeyA) {
			// �������� ����themeProB�м���ֵ
			if (!keyStringB.contains(String.valueOf(keyA))) {
				distribute2.put(keyA, (double) 0);

			}
		}

		// ͬ�� �ж�key�Ƿ����themeProA��
		for (Integer keyB : themeProKeyB) {
			if (!keyStringA.contains(String.valueOf(keyB))) {
				distribute1.put(keyB, (double) 0);
				// ���������A��û�е�key��ӽ�ȥ
				themeProKey.add(keyB);
			}

		}

		// ͨ��ͳһ��key�õ�value������ksɢ��
		for (Integer key : themeProKey) {
			double themeProAValue = distribute1.get(key);
			double themeProBValue = distribute2.get(key);
			// �е�valueֵΪ0
			if (themeProBValue == 0) {
				break;
			} else {
				double klSingle = Math.log(themeProAValue / themeProBValue)
						* themeProAValue;
				KLDis = +klSingle;
			}

		}

		return KLDis;*/
		
		return 0.5;
	}
}
