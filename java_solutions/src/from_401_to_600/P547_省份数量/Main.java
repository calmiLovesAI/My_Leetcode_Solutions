package from_401_to_600.P547_省份数量;

/*
计算连通分量数的另一个方法是使用并查集。初始时，每个城市都属于不同的连通分量。
遍历矩阵 isConnected，如果两个城市之间有相连关系，则它们属于同一个连通分量，对它们进行合并。
遍历矩阵 isConnected的全部元素之后，计算连通分量的总数，即为省份的总数。
 */


class Solution {
    public int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
        int[] visited = new int[cities];
        int ans = 0;
        for (int i = 0; i < cities; i++) {
            if (visited[i] == 0){
                dfs(isConnected, i, cities, visited);    // 深度优先遍历
                ans++;
            }
        }
        return ans;
    }

    public void dfs(int[][] isConnected, int i, int cities, int[] visited){
        for (int j = 0; j < cities;j++){
            if (isConnected[i][j] == 1 && visited[j] == 0){
                visited[i] = 1;
                dfs(isConnected, j, cities, visited);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int[][] isConnected = new int[][]{{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(new Solution().findCircleNum(isConnected));
    }
}
