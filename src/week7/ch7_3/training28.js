// 1.‘Home’이라고 적힌 <li> 태그를 생성하세요.
element = document.createElement("li");
element.innerHTML = "Home";

// 2.insertBefore()를 사용해서 menu의 <li> 태그 앞에 'Home'을 삽입하세요.
let menu = document.getElementById("menu");
menu.insertBefore(element, menu.firstChild);

// 3. insertBefore()를 사용해서 calendar의 첫 번째 child로 예약 알람 문구를 삽입하세요.
let calendar = document.getElementById("calendar");
text = document.createElement("div");
text.innerHTML = "<strong>안녕하세요!</strong> 예약하신 날짜입니다.";
calendar.insertBefore(text, calendar.firstChild);

// 4. removeChild()를사용해서 'Contact'라고 적힌 <li> 태그를 삭제하세요.
menu.removeChild(menu.lastElementChild);