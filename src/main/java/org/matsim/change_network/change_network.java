package org.matsim.change_network;

import org.matsim.api.core.v01.network.Link;
import org.matsim.api.core.v01.network.Network;
import org.matsim.api.core.v01.network.Node;
import org.matsim.core.network.NetworkUtils;

public class change_network {
    public static void main(String[] args){
        var network = NetworkUtils.readNetwork("/home/psharma/Desktop/Projects/Bimodal_extension/matsim/matsim-berlin/scenarios/modifiedChessboard9x9.xml");
        for (var link : network.getLinks().values()) {
            Node fromNode = link.getFromNode();
            Node toNode = link.getToNode();
        }
    }
}
