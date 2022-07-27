/**
 * DFS
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class DFS {
    private String startingState;
    private int depth;
    private String targetState;
    private String moves = " Cannot move to target";
    private int nodesVisited;
    private long timeStart;
    private long timeEnd;
    private String fitness = "Unknown";
    private int nodesTotal = 1;
    private boolean found = false;

    /**
     * constructor
     * 
     * @param startingState
     *            the initial state
     * @param depth
     *            the target depth
     * @param targetState
     *            the target game state
     */
    public DFS(String startingState, String depth, String targetState) {
        this.startingState = startingState;
        this.depth = Integer.parseInt(depth);
        this.targetState = targetState;

    }


    /**
     * printing out the result
     */
    public void print() {
        timeStart = System.currentTimeMillis();
        recursive(startingState, depth, targetState, "");

        System.out.println("Search from " + startingState + " to "
            + targetState);
        System.out.println("Moves to target:" + moves);
        System.out.println("Target fitness: " + fitness);
        
        if (depth == 1 && !found) {
            nodesTotal -= 1;
        }
        
        if (found) {
            System.out.println("Nodes Visited: " + nodesVisited);
        }
        else {
            System.out.println("Nodes Visited: " + nodesTotal);

        }

        long dif = timeEnd - timeStart;
        System.out.println("Duration: " + dif);

    }


    /**
     * get Nodes total
     * 
     * @return total nodes
     */
    public int getNodesTotal() {
        return nodesTotal;
    }
    
    /**
     * get total visited nodes
     * 
     * @return total nodes
     */
    public int getNodesVisited() {
        return nodesVisited;
    }


    /**
     * recursive call that gets solution
     * 
     * @param start
     *            initial position
     * @param depth
     *            target depth
     * @param end
     *            the target solution
     * @param parent
     *            the path that lead to the finished position
     */
    private void recursive(String start, int d, String end, String parent) {
        nodesTotal++;

        if (d == 0) {
            return;
        }

        String[] nextMoves = ChessFaker.getNextMoves(start);

        for (int i = 0; i < nextMoves.length; i++) {

            String newBoard = ChessFaker.getNextBoard(start, nextMoves[i]);

            if (newBoard.equals(end) && found == false) {
                moves = parent + " + " + nextMoves[i];
                fitness = Integer.toString(ChessFaker.getFitness(targetState));
                timeEnd = System.currentTimeMillis();
                nodesVisited = nodesTotal;
                found = true;

            }
            if (parent.equals("")) {
                recursive(newBoard, d - 1, end, " " + nextMoves[i]);
            }
            else {
                recursive(newBoard, d - 1, end, parent + " + " + nextMoves[i]);
            }

        }

    }
}
