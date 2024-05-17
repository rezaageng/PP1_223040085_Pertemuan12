public class Graph {
    private final Vertex[] vertexList;
    private final int[][] adjMat;
    private int nVerts;

    // Constructor
    public Graph(int maxVerts) {
        // inisialisasi vertexList dan adjMat
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        // inisialisasi adjMat
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    // method menambahkan vertex
    public void addVertex(char lab) {
        // menambahkan vertex baru ke vertexList
        vertexList[nVerts++] = new Vertex(lab);
    }

    // method menambahkan edge
    public void addEdge(int start, int end) {
        // menambahkan edge ke adjMat
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    // mehod menampilkan adjacency matrix
    public void adjacencyMatrix() {
        // melakukan iterasi pada adjMat dan menampilkan elemen
        for (int[] ints : adjMat) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
