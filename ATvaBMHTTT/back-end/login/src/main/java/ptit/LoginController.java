package ptit;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    // Dữ liệu giả lập để kiểm tra tên người dùng và mật khẩu
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    @PostMapping("/login")
    public Response login(@RequestBody LoginRequest loginRequest) {
        if (USERNAME.equals(loginRequest.getUsername()) && PASSWORD.equals(loginRequest.getPassword())) {
            return new Response("Login successful", true);
        } else {
            return new Response("Invalid username or password", false);
        }
    }

    // Lớp yêu cầu đăng nhập
    public static class LoginRequest {
        private String username;
        private String password;

        // Getters và Setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    // Lớp dữ liệu trả về API
    public static class Response {
        private String message;
        private boolean success;

        public Response(String message, boolean success) {
            this.message = message;
            this.success = success;
        }

        // Getters và Setters
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }
    }
}
