package com.rigisterNodes.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rigisterNodes.dto.NodeRequest;
import com.rigisterNodes.entity.Node;
import com.rigisterNodes.service.NodeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(NodeController.class);
	@Autowired
	private NodeService service;

	@PostMapping("/register")
	public Node registerNode(@Valid @RequestBody NodeRequest request) {
		log.info("Received request to register node: {}", request.getNodeName());

		Node savedNode = service.registerNode(request);

		log.info("Node registered successfully with ID: {}", savedNode.getId());
		return savedNode;
	}

	@GetMapping("/getAllNodes")
	public List<Node> getAllNodes() {
		log.info("Fetching all nodes");

		List<Node> nodes = service.getAllNodes();

		log.info("Total nodes fetched: {}", nodes.size());
		return nodes;
	}
	@GetMapping("/{id}")
	public Node getById(@PathVariable Long id) {
	    return service.getById(id);
	}
}