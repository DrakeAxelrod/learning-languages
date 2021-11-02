
interface DirectedGraph<Node> {

    int nNodes();

    int nEdges();

    void add(DirectedEdge<Node> e);

    void remove(DirectedEdge<Node> e);

    boolean contains(DirectedEdge<Node> e);

    Collection<DirectedEdge<Node>> outgoingEdges(Node from);
}
