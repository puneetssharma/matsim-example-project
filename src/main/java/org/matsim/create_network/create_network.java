package org.matsim.create_network;

import org.matsim.api.core.v01.network.Network;
import org.matsim.api.core.v01.network.NetworkFactory;
import org.matsim.api.core.v01.network.Node;
import org.matsim.core.network.NetworkUtils;
import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.Coord;
import org.matsim.utils.objectattributes.attributable.Attributes;

public class create_network {

    private static Attributes attributes;

    public static void main(String[] args){
        Network network = NetworkUtils.createNetwork();
        NetworkFactory factory = network.getFactory();
        for (int i=0;i<10;i++){
            for (int j = 0; j<10; j++){
                String node_id = "xy";
                node_id = node_id + "_" + i + "_" + j;
                Node new_node = factory.createNode(Id.createNodeId(node_id), new Coord(i * 1000, j * 1000));
                new_node.getAttributes().putAttribute("isStation",Boolean.TRUE);
                new_node.getAttributes().putAttribute("isCrossing",Boolean.TRUE);
                network.addNode(new_node);
                var attributes = new_node.getAttributes();
            }
        }

        NetworkUtils.writeNetwork(network,"/home/psharma/Desktop/Projects/Bimodal_extension/matsim/matsim_bimodal_puneet/example_networks/first_network.xml");
    }
}
