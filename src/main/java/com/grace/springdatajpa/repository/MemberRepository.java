package com.grace.springdatajpa.repository;

import com.grace.springdatajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
