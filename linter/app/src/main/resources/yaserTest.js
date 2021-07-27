function not(a) {
  if (a === 0)
    return 1
  else
    return 0
}

function nand(a,b) {
  return not(and(a, b))
}