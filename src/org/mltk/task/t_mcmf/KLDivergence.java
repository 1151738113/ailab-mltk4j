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
	 * 
	 * TODO (��Ľ�) ��Map
	 * 
	 * @author dd
	 * @param distribute1
	 * @param distribute2
	 * @return
	 */
	public static double compTopicsGenKL(Map<Integer, Double> distribute1,
			Map<Integer, Double> distribute2) {

		List<Double> themeProValueA = new ArrayList<Double>();
		List<Double> themeProValueB = new ArrayList<Double>();

		double KLDis = 0;
		double KLSingleA = 0;
		double KLSingleB = 0;

		for (Entry<Integer, Double> themeMapA : distribute1.entrySet()) {
			double themeProANumber = themeMapA.getValue();
			themeProValueA.add(themeProANumber);

		}

		for (Entry<Integer, Double> themeMapB : distribute2.entrySet()) {
			themeProValueB.add(themeMapB.getValue());
		}

		// ��List��ȥ
		for (int i = 0; i < themeProValueB.size(); i++) {
			double klDistanceA = Math.log(themeProValueA.get(i)
					/ themeProValueB.get(i))
					* themeProValueA.get(i);
			KLSingleA += klDistanceA;
			double klDistanceB = Math.log(themeProValueB.get(i)
					/ themeProValueA.get(i))
					* themeProValueB.get(i);
			KLSingleB += klDistanceB;
		}

		KLDis = (KLSingleA + KLSingleB) / (2 * themeProValueB.size());
		// System.out.println("JSɢ��Ϊ��" + KLDis);

		return KLDis;

	}
}
