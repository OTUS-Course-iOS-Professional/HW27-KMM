import SwiftUI
import shared

struct ContentView: View {

    @ObservedObject var vm = NewsViewModal()

	let greet = Greeting().greeting()

	var body: some View {
        Text(greet).onAppear {

            vm.loadData()


        }
	}
}



struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
