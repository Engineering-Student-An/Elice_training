/*지시사항을 따라 작성해주세요*/
const image = document.getElementsByClassName("zoom-img")[0];

function zoomIn() {
    /* 여기에 작성해주세요 */
    image.style.transform = "scale(1.2)";
    image.style.transition = "all 0.5s";
}

function zoomOut() {
    /* 여기에 작성해주세요 */
    image.style.transform = "scale(1.0)";
    image.style.transition = "all 0.5s";
}

/* 여기에 작성해주세요 */
image.addEventListener("mouseenter", zoomIn);
image.addEventListener("mouseleave", zoomOut);