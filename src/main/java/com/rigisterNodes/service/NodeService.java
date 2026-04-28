package com.rigisterNodes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigisterNodes.entity.Node;
import com.rigisterNodes.repository.NodeRepository;

@Service 
public class NodeService {

    @Autowired
    private NodeRepository repo;

    public Node registerNode(Node node) {
        return repo.save(node);
    }
    
    public List<Node> getAllNodes() {
        return repo.findAll();
    }
}