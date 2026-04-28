package com.rigisterNodes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rigisterNodes.entity.Node;

public interface NodeRepository extends JpaRepository<Node, Long> {
}
