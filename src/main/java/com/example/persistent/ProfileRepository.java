package com.example.persistent;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.member.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
