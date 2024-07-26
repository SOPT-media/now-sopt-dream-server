document.addEventListener("DOMContentLoaded", function() {
    const chemeNames = ["김세은", "이가영", "양성재", "이윤민", "안서연", "최우영", "이명진", "김수연", "박채연", "신정윤", "방민지", "최서인", "최윤한", "장지원"];
    const nowNames = ["조승우", "박세은", "여민서", "황현진", "곽의진", "류희재", "이재훈", "곽성준", "정채은", "정동규"];
    const nameText = document.querySelector(".name-text").innerText.trim();

    if (chemeNames.includes(nameText)) {
        document.getElementById("cheme-button").style.display = "block";
        document.getElementById("cheme-button").addEventListener("click", function() {
            window.location.href = "/cheme";
        });
    }

    if (nowNames.includes(nameText)) {
        document.getElementById("now-button").style.display = "block";
        document.getElementById("now-button").addEventListener("click", function() {
            window.location.href = "/now";
        });
    }
});