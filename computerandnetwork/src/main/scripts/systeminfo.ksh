#! /bin/bash

googlechrome_version=$(/Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome --version)
echo $googlechrome_version
firefox_version=$(/Applications/Firefox.app/Contents/MacOS/firefox --version)
echo $firefox_version
safari_version=$(/usr/libexec/PlistBuddy -c "print CFBundleShortVersionString" /Applications/Safari.app/Contents/Info.plist)
echo "Safari Version :"  $safari_version

echo "baba"


for((i=0; i<100; i++)){
echo "Hello World! : "$i
}