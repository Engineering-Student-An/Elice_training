const icons = document.querySelectorAll('.favorites-icon');

icons.forEach(icon => {
    icon.addEventListener('click', function() {
        // 이미 선택된 박스가 있는 경우
        icons.forEach(otherIcon => {
            if (otherIcon !== this) {
                otherIcon.classList.remove('on');
            }
        });

        // 현재 클릭한 박스의 클래스를 토글
        this.classList.toggle('on');
    });
});