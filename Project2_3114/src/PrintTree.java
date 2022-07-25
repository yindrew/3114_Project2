
public class PrintTree {
    
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
            
            System.out.print(" + " + nextMoves[i] + " = ");
            
            System.out.println(newBoard + " fitness: " + ChessFaker.getFitness(
                newBoard));            
            
            this.print(newBoard, depth - 1);   
        }
        System.out.println();
           
    }
    
    public Node print1(String startingState, int depth, LinkedList path) {
        if (depth == 0) {
            return null;
        }
        
        String[] nextMoves = ChessFaker.getNextMoves(startingState);
        
        for (int i = 0; i < nextMoves.length; i++) {
            
            String newBoard = ChessFaker.getNextBoard(startingState,
                nextMoves[i]);
            
            path.insert(nextMoves[i]);
            System.out.print(" " + path.getHead().val() + " ");
            
            System.out.println(newBoard + " fitness: " + ChessFaker.getFitness(
                newBoard));            
            
            this.print1(newBoard, depth - 1, path);   
        }
        System.out.println();
        return null;
           
    }



}
