package org.efrei;

//import org.efrei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
//    private AuthService authService;

//    @PostMapping("/signup")
//    public ResponseEntity<User> signup(@RequestBody User user) {
//        return ResponseEntity.ok(authService.signup(user));
//    }
//
//    @GetMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password) {
//        if (authService.login(username, password) != null) return "C BON";
//        else return "C PAS BON";
//    }

    @GetMapping("/ping")
    public String ping() {
        return "Authentication service is running correctly! Token: ";
    }
}
