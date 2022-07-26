-----Recursive functions-----

-----Print Tree-----
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


-----DFS-----
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
    private void recursive(String start, int depth, String end, String parent) {
        nodesTotal++;

        if (depth == 0) {
            return;
        }

        String[] nextMoves = ChessFaker.getNextMoves(startingState);

        for (int i = 0; i < nextMoves.length; i++) {

            String newBoard = ChessFaker.getNextBoard(start, nextMoves[i]);

            if (newBoard.equals(end) && found == false) {
                moves = parent + " + " + nextMoves[i];
                fitness = Integer.toString(ChessFaker.getFitness(
                    startingState));
                timeEnd = System.currentTimeMillis();
                nodesVisited = nodesTotal;
                found = true;

            }

            recursive(newBoard, depth - 1, end, parent + " + " + nextMoves[i]);

        }

    }
