package LR_3;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Graph> graphCfg = XmlSerialization.deserialize("src/main/resources/graph.xml", Graph.class);
        if (graphCfg.isPresent()) {
            Graph graph = graphCfg.get();
            for (Graph.Node node : graph.getNodes()) {
                NodeAgent agent = new NodeAgent();
                agent.setId(node.getId());
                agent.setNeighbors(node.getNeighbors());
                agent.initiateSearch();
            }
        } else {
            System.out.println("Failed to load graph configuration.");
        }
    }
}