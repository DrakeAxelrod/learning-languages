
class DirectedEdge<Node> {

    private final Node from;
    private final Node to;
    private final double weight;

    DirectedEdge(Node from, Node to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    DirectedEdge(Node from, Node to) {
        this(from, to, 1.0);
    }

    Node from() {
        return from;
    }

    Node to() {
        return to;
    }

    double weight() {
        return weight;
    }

    DirectedEdge<Node> reverse() {
        return new DirectedEdge<>(to, from, weight);
    }
}
