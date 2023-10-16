// Task 1: Reverse every word in a sentence
function reverseWords(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);

// Task 2: Perform sorting of an array in descending order
function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const inputArray = [4, 8, 1, 6, 3, 9, 2];
const sortedArray = sortArrayDescending(inputArray);
console.log("Sorted Array (Descending Order): " + sortedArray);
