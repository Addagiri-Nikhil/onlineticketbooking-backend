package com.onlinebooking.TicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onlinebooking.TicketBooking.entity.Host;

import java.util.Optional;

public interface HostRepository extends JpaRepository<Host, Long> {
    Optional<Host> findByEmail(String email);
}
