import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
           KoinStarterKt.startKoin()
       }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
