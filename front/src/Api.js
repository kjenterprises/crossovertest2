export default function api() {
  if (process.env.NODE_ENV === 'production') {
    return 'https://tiy-crossover.herokuapp.com';
  } else {
   return 'http://localhost:3000';
  }
}
