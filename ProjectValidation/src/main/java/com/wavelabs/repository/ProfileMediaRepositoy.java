package com.wavelabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wavelabs.entity.ProfileMedia;


@Repository
public interface ProfileMediaRepositoy extends JpaRepository<ProfileMedia, Long> {

}
