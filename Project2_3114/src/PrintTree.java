
public class PrintTree {

    
    

    

    public void print1(String startingState, int depth, String parent) {

    public PrintTree(String startingState, String depth) {
        print(startingState, Integer.parseInt(depth));
    }
    
    public void print(String startingState, int depth) {

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
            
            this.print1( newBoard, depth - 1, parent + " + " + nextMoves[i] );   
        }           
    }



}
