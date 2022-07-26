/**
 * prints out the various branches of the tree up till a certain depth
 * 
 * @author yindrew
 * @version 2021.07.25
 */
public class PrintTree {
    private String startingState;
    private int depth;


    /**
     * constructor for PrintTree
     * 
     * @param startingState
     *            the initial board state
     * @param depth
     *            the path up to the current game state
     */
    
    

   

    public PrintTree(String startingState, String depth) {
        this.startingState = startingState;
        this.depth = Integer.parseInt(depth);
    }

    /**
     * prints out the tree
     */
    public void print() {
        System.out.println(startingState + " fitness: " + ChessFaker.getFitness(
            startingState));
        recursive(startingState, depth, "");
    }


    /**
     * recursive call to help print
     * 
     * @param startingState
     *            the initial board state
     * @param depth
     *            number of moves maximum
     * @param parent
     *            the path up the the current game state
     */
    private void recursive(String startingState, int depth, String parent) {
        if (depth == 0) {
            return;
        }
        String[] nextMoves = ChessFaker.getNextMoves(startingState);

        for (int i = 0; i < nextMoves.length; i++) {

            String newBoard = ChessFaker.getNextBoard(startingState,
                nextMoves[i]);

            System.out.print(parent + " + " + nextMoves[i] + " = ");

            System.out.println(newBoard + " fitness: " + ChessFaker.getFitness(
                newBoard));

            recursive(newBoard, depth - 1, parent + " + " + nextMoves[i]);
        }
    }

}
