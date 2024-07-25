document.addEventListener('DOMContentLoaded', () => {
    const dropdown = document.getElementById('dropdown');
    const userName = document.getElementById('userName');
    const submitButton = document.getElementById('submitButton');

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
