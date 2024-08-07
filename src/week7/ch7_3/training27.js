function myFunction() {
    var element = document.createElement("p");
    element.innerHTML = "이것이 추가될 문장입니다.";
    document.getElementById("myDiv").appendChild(element);
}