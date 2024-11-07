function message() {
  var firstName = document.getElementById("validationCustom01");
  var lastName = document.getElementById("validationCustom02");
  var email = document.getElementById("exampleFormControlInputEmail");
  var msg = document.getElementById("exampleFormControlTextarea1");
  const success = document.getElementById("success");
  const danger = document.getElementById("danger");

  if (
    firstName.value === "" ||
    lastName.value === "" ||
    email.value === "" ||
    msg.value === ""
  ) {
    danger.style.display = "block";
  } else {
    setTimeout(() => {
      firstName.value = "";
      lastName.value = "";
      email.value = "";
      msg.value = "";
    }, 2000);

    success.style.display = "block";
  }

  setTimeout(() => {
    danger.style.display = "none";
    success.style.display = "none";
  }, 4000);
}

function updateText(text) {
  let delay = 200;

  let h1 = document.getElementById("animated");

  h1.innerHTML = text
    .split("")
    .map((letter) => {
      console.log(letter);
      return `<span>` + letter + `</span>`;
    })
    .join("");

  Array.from(h1.children).forEach((span, index) => {
    setTimeout(() => {
      span.classList.add("wavy");
    }, index * 60 + delay);
  });
}

document.getElementById("textField").addEventListener("input", (event) => {
  updateText(event.target.value);
});

updateText("Hello, World.");



