var myUl = document.querySelector("ul");

//1. for loop을 사용해서 index.html의 <ul></ul> 내에 li 태그 문장 20개를 createTextNode()와 appendChild()를 사용해서 추가합니다.
for(i=0;i<=20; i++) {
    // <li> 요소 생성
    var node = document.createElement("li");

    // 텍스트 노드 생성
    var textNode = document.createTextNode(i + "번째 문장");

    // <li>에 텍스트 노드 추가
    node.appendChild(textNode);

    // <ul>에 <li> 추가
    myUl.appendChild(node);

}