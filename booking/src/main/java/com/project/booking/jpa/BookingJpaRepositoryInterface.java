package com.project.booking.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.booking.entity.BookingEntity;


@Repository
public interface BookingJpaRepositoryInterface extends JpaRepository<BookingEntity, Long>{
	
	

}

