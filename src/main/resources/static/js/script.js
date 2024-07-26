document.addEventListener('DOMContentLoaded', () => {
    const dropdown = document.getElementById('dropdown');
    const userName = document.getElementById('userName');
    const submitButton = document.getElementById('submitButton');
    console.log("메인 JavaScript is running");
    function toggleButtonState() {
        if (dropdown.value && userName.value.trim() !== '') {
            submitButton.disabled = false;
        } else {
            submitButton.disabled = true;
        }
    }

    dropdown.addEventListener('change', toggleButtonState);
    userName.addEventListener('input', toggleButtonState);
});
