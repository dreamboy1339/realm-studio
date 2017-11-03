#!/usr/bin/env bash

# Exit on error
set -e

# Install dependencies
npm install

# Install native dependencies for windows
./node_modules/.bin/electron-builder install-app-deps --platform win32

# Build the app
npm run build

# Package the app for windows
./node_modules/.bin/electron-builder --linux --windows --publish never
