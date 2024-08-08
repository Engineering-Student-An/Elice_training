/*지시사항을 따라 작성해주세요*/

function scrollUp(e) {
    /*1. 함수를 적용할 target 변수 지정하기*/
    var button = document.getElementById(e);
    /*2. 버튼 클릭 시 화면의 최상단으로 이동하기*/
    button.addEventListener('click', function() {
        window.scrollTo({top:0, left:0, behavior:'smooth'});
    });
}

scrollUp("scroll-btn");
