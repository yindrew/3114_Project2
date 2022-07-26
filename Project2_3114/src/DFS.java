
public class DFS {
    private String startingState;
    private int depth;
    private String targetState;
    private String moves = "Cannot move to target";
    private int nodesVisited = 0;
    private double timeStart;
    private double timeEnd;
    private String fitness = "Unknown";
    private int nodesTotal = 0;
    private boolean found = false;

    public DFS(String startingState, String depth, String targetState) {
        this.startingState = startingState;
        this.depth = Integer.parseInt(depth);
        this.targetState = targetState;
 
    }


    public void print() {
        timeStart = System.currentTimeMillis();
        recursive(startingState, depth, targetState, "");
        
        System.out.println("Search from " + startingState + " to "
            + targetState);
        System.out.println("Moves to target:" + moves);
        System.out.println("Target fitness: " + fitness);
        System.out.println("Nodes Visited: " + nodesVisited);
        System.out.println("Duration: " + (timeEnd - timeStart));

    }

    private void recursive(String start, int depth, String end, String parent) {
        nodesTotal++;

        if (depth == 0) {
            return;
        }
 
        String[] nextMoves = ChessFaker.getNextMoves(startingState);
        
        for(int i = 0; i < nextMoves.length; i++) {
            
            String newBoard = ChessFaker.getNextBoard(start, nextMoves[i]);
            
            if (newBoard.equals(end) && found == false) {
                moves = parent + " + " + nextMoves[i];
                fitness = Integer.toString(ChessFaker.getFitness(startingState));
                timeEnd = System.currentTimeMillis();
                nodesVisited = nodesTotal;
                found = true;
                System.out.println("FOUND    ");
            }
            System.out.println(newBoard + " " + end + " " + parent + " " + nextMoves[i]);
                        
            recursive(newBoard, depth - 1, end, parent + " + " + nextMoves[i]);

        }

    }
}
