package com.rigisterNodes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigisterNodes.dto.NodeRequest;
import com.rigisterNodes.entity.Node;
import com.rigisterNodes.exception.NodeNotFoundException;
import com.rigisterNodes.repository.NodeRepository;

@Service 
public class NodeService {

    @Autowired
    private NodeRepository repository;

    public Node registerNode(NodeRequest request) {
    	
    	Node node=new Node();
    	node.setNodeName(request.getNodeName());
    	node.setIpAddress(request.getIpAddress());
    	node.setStatus(request.getStatus());
        return repository.save(node);
    }
    
    public List<Node> getAllNodes() {
        return repository.findAll();
    }

    public Node getById(Long id) {

        return repository.findById(id)
            .orElseThrow(() -> new NodeNotFoundException("Node not found with id: " + id));
    }
}