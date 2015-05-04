package org.mltk.task.t_mcmf;

public class MinCostMaxFlow {

	static double INF = 0xffffff * 1.0;

	// �����
	public class Edge {

		int u, v; // ��ʼ����յ�
		double flow; // ����
		double cost; // ����
		int next; // �����ڽӻ�
		int re; // ��ߵ��±�
	}

	// �ߵļ���
	Edge[] edges;
	// �����������������Լ�����������С
	int n, m, finalCost;
	// �ߵļ�����
	int eCnt;
	// �ߵı���±�
	int[] edgeHead;
	// �������
	int[] que, pre;
	double[] dis;
	// ���ʱ��
	boolean[] vis;

	public void addEdge(int u, int v, int flow, int cost) {
		// ����
		edges[eCnt].u = u;
		edges[eCnt].v = v;
		edges[eCnt].flow = flow;
		edges[eCnt].cost = cost;
		edges[eCnt].next = edgeHead[u];
		edges[eCnt].re = eCnt + 1;
		edgeHead[u] = eCnt++;

		// ����
		edges[eCnt].v = u;
		edges[eCnt].u = v;
		edges[eCnt].flow = 0;
		edges[eCnt].cost = -cost;
		edges[eCnt].next = edgeHead[v];
		edges[eCnt].re = eCnt - 1;
		edgeHead[v] = eCnt++;
	}

	public boolean spfa() {
		int i, head = 0, tail = 1;
		for (i = 0; i <= n; i++) {
			dis[i] = INF;
			vis[i] = false;
		}
		dis[0] = 0;
		que[0] = 0;

		vis[0] = true;
		while (head < tail) {
			int u = que[head++];
			for (i = edgeHead[u]; i != -1; i = edges[i].next) {
				int v = edges[i].v;
				if (edges[i].flow != 0 && dis[v] > dis[u] + edges[i].cost) {
					dis[v] = dis[u] + edges[i].cost;
					pre[v] = i;
					if (vis[v] == false) {
						vis[v] = true;
						que[tail++] = v;
					}
				}
			}
		}

		return true;
	}

	public void test() {
		Edge ed = new Edge();
		ed.v = 0;

	}
}
