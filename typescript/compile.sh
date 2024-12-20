#!/bin/sh

# NOTE: You must use the globally installed TypeScript compiler and types.
tsc --typeRoots $(npm root -g)/@types
