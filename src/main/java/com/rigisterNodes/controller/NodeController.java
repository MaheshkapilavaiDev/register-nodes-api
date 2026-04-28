package com.rigisterNodes.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rigisterNodes.entity.Node;
import com.rigisterNodes.service.NodeService;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(NodeController.class);
	@Autowired
	private NodeService service;

	@PostMapping("/register")
	public Node registerNode(@RequestBody Node node) {
		log.info("Received request to register node: {}", node.getNodeName());

		Node savedNode = service.registerNode(node);

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
}