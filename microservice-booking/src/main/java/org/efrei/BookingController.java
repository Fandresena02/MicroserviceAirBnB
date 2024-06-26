package org.efrei;

import org.efrei.clients.AuthServiceClient;
import org.efrei.Entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private AuthServiceClient authClient;

    @PostMapping("/new")
    public ResponseEntity<?> createBooking(@RequestParam Long userId, @RequestBody Booking booking) {
        if (!isUserLoggedIn(userId)) {
            return ResponseEntity.status(401).body("User not logged in");
        }
        return ResponseEntity.ok(bookingService.createBooking(booking));
    }

    @GetMapping("/{bookingId}")
    public ResponseEntity<?> getBooking(@RequestParam Long userId, @PathVariable Long bookingId) {
        if (!isUserLoggedIn(userId)) {
            return ResponseEntity.status(401).body("User not logged in");
        }
        return ResponseEntity.ok(bookingService.getBooking(bookingId));
    }

    @PutMapping("/{bookingId}/update")
    public ResponseEntity<?> updateBooking(@RequestParam Long userId, @PathVariable Long bookingId, @RequestBody Booking booking) {
        if (!isUserLoggedIn(userId)) {
            return ResponseEntity.status(401).body("User not logged in");
        }
        return ResponseEntity.ok(bookingService.updateBooking(bookingId, booking));
    }

    @PutMapping("/{bookingId}/cancel")
    public ResponseEntity<?> cancelBooking(@RequestParam Long userId, @PathVariable Long bookingId) {
        if (!isUserLoggedIn(userId)) {
            return ResponseEntity.status(401).body("User not logged in");
        }
        bookingService.cancelBooking(bookingId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/checkConnection/{userId}")
    public <userId> Boolean isUserLoggedIn(@PathVariable Long userId) {
        return authClient.isUserLoggedIn(userId);
    }
    @GetMapping("/ping")
    public String ping() {
        return "Booking service is running correctly!";
    }
}
