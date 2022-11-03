# Simple-Http-Server
1. Giới thiệu sơ lược chủ đề

a.	Mục tiêu
- Tạo ra một Server HTTP đơn giản có thể xử lý được nhiều request cùng lúc và chỉ nhận các HTTP Request theo chuẩn RFC
- Server nhận request và trả về các trang static web

b.	Kết quả đã đạt được 
Tạo ra một Server HTTP đơn giản có thể xử lý được nhiều request cùng lúc và chỉ nhận các HTTP Request theo chuẩn RFC

c.	Hạn chế, hướng phát triển 
- Server nhận các request và trả về các trang static web


2. Tổng hợp công việc
- B19DCCN237 - Bùi Trung Hiếu: Khởi tạo Server đơn giản, thêm chức năng xử lý nhiều request cùng lúc
  -	HttpServer.java
  -	Configuration.java
  -	ConfigurationManager.java
  -	Json.java
  -	http.json
  -	HttpConnectionWorkerThread.java
  -	ServerListenerThread.java
- B19DCCN601 - Nguyễn Vĩnh Tú: Thêm định nghĩa cho HTTP request hướng theo chuẩn RFC
  -	HttpParser.java
  -	HttpParserTest.java
  -	HttpMessage.java
  -	HttpMethod.java
  -	HttpParsingException.java
  -	HttpRequest.java
  -	HttpStatusCode.java
- B19DCCN615 – Nguyễn Anh Tuấn: Sửa lại những phần thiếu ở phần trước, ghép code, thêm các test case để kiểm tra các exception của Http Request hướng theo chuẩn RFC
  -	HttpServer.java
  -	Configuration.java
  -	ConfigurationManager.java
  -	Json.java
  -	http.json
  -	HttpConnectionWorkerThread.java
  -	ServerListenerThread.java
  -	HttpParser.java
  -	HttpParserTest.java
  -	HttpMessage.java
  -	HttpMethod.java
  -	HttpParsingException.java
  -	HttpRequest.java
  -	HttpStatusCode.java
  -	BadHttpVersionException.java
  -	HttpVersion.java
  -	HttpVersionTest.java
  
3. Quá trình phát triển
  1.		1.0.0	Mới chỉ config server, server chưa hoạt động	- Sử dụng ServerSocket để server có thể hoạt động một cách đơn giản	- OK
  2.		1.0.1	Server chưa xử lý được nhiều request cùng luc	- Sử dụng Thread để server có thể tiếp nhận nhiều request ở nhiều thread khác nhau	- OK
  3.		1.0.2	Server vẫn sử dụng System.out.println để logging	- Sử dụng slf4j để logging	-OK
  4.		1.0.3	Server tiếp nhận mọi loại request	-Cài dặt lớp HttpRequest và các lớp liên quan để server chỉ tiếp nhận HttpRequest theo chuẩn RFC	-OK
  5.		1.0.4	Phần chỉ nhận Http request theo chuẩn RFC chưa đầy đủ	- Cài đặt các lớp liên quan cũng như các test case để kiểm tra các exception hướng tới Http Request chuẩn RFC	-OK
  5.		1.0.5	Các test HttpParser	- Sửa lỗi khiến cho các test bị sai	-OK

